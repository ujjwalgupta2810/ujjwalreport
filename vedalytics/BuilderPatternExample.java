package vedalytics;

public class BuilderPatternExample {

    // Product class (Complex Object)
    public static class Computer {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;

        // Private constructor to prevent direct instantiation
        private Computer(Builder builder) {
            this.CPU = builder.CPU;
            this.RAM = builder.RAM;
            this.storage = builder.storage;
            this.graphicsCard = builder.graphicsCard;
        }

        @Override
        public String toString() {
            return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + ", GraphicsCard=" + graphicsCard + "]";
        }

        // Static Builder class
        public static class Builder {
            private String CPU;
            private String RAM;
            private String storage;
            private String graphicsCard;

            public Builder setCPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            public Builder setRAM(String RAM) {
                this.RAM = RAM;
                return this;
            }

            public Builder setStorage(String storage) {
                this.storage = storage;
                return this;
            }

            public Builder setGraphicsCard(String graphicsCard) {
                this.graphicsCard = graphicsCard;
                return this;
            }

            public Computer build() {
                return new Computer(this);
            }
        }
    }

    // Main method to demonstrate the Builder pattern
    public static void main(String[] args) {
        // Using the builder to create a Computer object
        Computer myComputer = new Computer.Builder()
                                .setCPU("Intel i7")
                                .setRAM("16GB")
                                .setStorage("512GB SSD")
                                .setGraphicsCard("NVIDIA GTX 1660")
                                .build();

        System.out.println(myComputer);
    }
}
