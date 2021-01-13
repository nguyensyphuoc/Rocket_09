package entity;

public class CPU {
    private float price;
    private Processor processor;
    private Ram ram;

    public CPU() {
    }

    public class Processor{
        private int coreAmount;
        private String menufacturer;

        public float getCache(){
            return 4.3f;
        }
    }

    public class Ram {
        private int memory;
        private String menufacturer;

        public float getClockSpeed(){
            return 5.5f;
        }
    }
}
