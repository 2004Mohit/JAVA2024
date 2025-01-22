class StaticDemo
{
        int x=30;
        static int y=40;
        void fun(){
                System.out.println("In fun method");
        }
        static void run(){
                System.out.println("In run method");
        }
        public static void main(String[] args)
        {
                StaticDemo obj1=new StaticDemo();
                System.out.println(obj1.x);
                System.out.println(obj1.y);
                obj1.fun();
                obj1.run();
        }
}
