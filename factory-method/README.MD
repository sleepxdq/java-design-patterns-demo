### 定义
>定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类。工厂方法让类的实例化推迟到子类中进行
意思就是，定义一个工厂接口，接口中以一个生产对象的接口，让工厂子类实现这个接口来生产对象，来创建对象
###模型
![模型图](https://upload-images.jianshu.io/upload_images/13503310-c141306dd90ff0bc.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
### 代码实例
1. 工厂接口
```
public interface CardFactory {

    /**
     * 创建对象
     * @param cardType
     * @return
     * @throws Exception
     */
    Card createCard(CardType cardType) throws Exception;
}
```
2. 实现工厂，实现方法
```
public class CardFactoryImpl implements CardFactory {

    private static Map<CardType,Card> map = new HashMap<CardType, Card>();

    /**
     * 根据type创建对于的对象
     * @param cardType
     * @return
     * @throws Exception
     */
    public Card createCard(CardType cardType) throws Exception {
        if (!map.containsKey(cardType)){
            throw new Exception("无此类型的card");
        }
        return map.get(cardType);
    }

    static {
        map.put(CardType.GREEN_CARD, new GreenCard());
        map.put(CardType.RED_CARD, new RedCard());
    }
}
```
>实现createCard方法来根据不同的type创建对应的对象，这里我是用集合来存放对象，目的是减少多个if判断
3. 产品类
```
public interface Card {

    public void color();
}
```
```
public class GreenCard implements Card {
    public void color() {
        System.out.println("green card");
    }
}
```
```
public class RedCard implements Card {
    public void color() {
        System.out.println("red card");
    }
}
```
### 用途
>1. 良好的封装性，调用者只需知道产品的type，并需要之道创建的对象的过程
>2. 良好的扩展性，出现第三种卡片，我们只需要创建一个新的卡片类和在工厂中的map中添加，而对于调用者不需要更改任何代码，只需要使用新的type就可以获得新的对象