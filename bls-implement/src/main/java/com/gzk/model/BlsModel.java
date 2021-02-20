package com.gzk.model;

import it.unisa.dia.gas.jpbc.Element;
import it.unisa.dia.gas.jpbc.Pairing;
import it.unisa.dia.gas.plaf.jpbc.pairing.PairingFactory;

public enum BlsModel {
    //如果涉及到反序列化创建对象时推荐使用枚举的方式来实现单例,因为Enum能防止反序列化时重新创建新的对象
    //单例模式
    instance;

    public final Pairing pairing;
    public final Element systemParameters;

    BlsModel(){
        pairing = PairingFactory.getPairing("a.properties");
        systemParameters = pairing.getG2().newRandomElement(); // this will be a hardcoded value in the future
    }
}