package com.java.CallBack;

public class PaintFreme {
    public static void drawFrame(IMyFrame f){
        System.out.println("启动线程");
        System.out.println("增加循环");
        System.out.println("查看消息栈");

        //画窗口
        f.paint();
        System.out.println("启动缓存");
    }

    public static void main(String[] args) {
        drawFrame(new GameFrame01());
    }
}
class GameFrame01 implements IMyFrame /*extends MyFrame*/{

    public void paint() {
        System.out.println("GameFrame01.paint()");
        System.out.println("画窗口");
    }
}
class GameFrame02 implements IMyFrame{

    public void paint() {
        System.out.println("GameFrame02.paint()");
        System.out.println("画窗口");
    }
}
