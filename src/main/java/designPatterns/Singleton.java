    package designPatterns;

    public class Singleton {

        private static Singleton instance;
        private Singleton(){};
        public synchronized Singleton getInstance(Singleton instance){
            if(instance==null){
                instance = new Singleton();
            }
            return instance;
        }
    }
