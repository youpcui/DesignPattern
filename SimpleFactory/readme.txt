简单工厂与超类关联，根据传入的参数自动返回子类对象。
子类要继承自超类或实现接口。

point 1：
Father f = SimpleFactory.createInstance(Object o);

point 2：
createInstance(Object o){
    switch(o){
    case "boy":    return new Boy();
    case "girl":   return new Girl();
    }
}

优点：
客户端与操作类的松耦合，便于扩展程序。

