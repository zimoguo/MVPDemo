package com.zimo.guo.rx.operator;

import com.zimo.guo.exception.NetworkConnectionException;
import com.zimo.guo.exception.RequestIllegalException;
import com.zimo.guo.model.BaseBean;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;

/**
 * Created by apple on 16/3/21.
 */
public class OperatorRequestMap<T> implements Observable.Operator<T, BaseBean<T>> {

    @Override
    public Subscriber<? super BaseBean<T>> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<BaseBean<T>>() {
            @Override
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override
            public void onError(Throwable e) {
                if (e instanceof RequestIllegalException){
                    subscriber.onError(e);
                }else{
                    subscriber.onError(new NetworkConnectionException(e));
                }
            }

            @Override
            public void onNext(BaseBean<T> tBaseBean) {
                try {
                    if (!tBaseBean.getResultObj().isResult()){
                        throw new RequestIllegalException("请求结果出错！");
                    }else{
                        subscriber.onNext(tBaseBean.getObj());
                    }
                } catch (Throwable e) {
                    Exceptions.throwOrReport(e, this, tBaseBean);
                }
            }
        };
    }
}
