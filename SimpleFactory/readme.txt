简单工厂与超类关联，根据传入的参数自动返回子类对象。

point 1：
Father f = SimpleFactory.createInstance(Object o);

point 2：
createInstance(Object o){
    switch(sm){
    case "o":    return new Son();
    }
}

优点：
客户端与操作类的松耦合，便于扩展程序。

