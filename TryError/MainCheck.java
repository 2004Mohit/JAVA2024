class TestDemo{


        static char ch1 = 'A';

        char ch2 = 'B';

        void printChar(){
                System.out.println(TestDemo.ch1);
                System.out.println(ch2);
        }
        public static void main(String[] args){


                TestDemo obj = new TestDemo();
                obj.printChar();

        }
}
