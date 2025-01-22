class InputDemo1
{
        void fun(){
                System.out.println("In fun method");
        }
        static void run(){
                System.out.println("In run method");
        }
        public static void main(String[] args)
        {
                System.out.println("In main method");
                run();
                InputDemo1 obj = new InputDemo1();
                obj.fun();
        }
}
