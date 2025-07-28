public class task2 {
    public static class TV {
        private String model;
        private String resolution;
        private int currentChannel;
        private int volumeLevel;
        private boolean isTurnedOn;

        // Конструктор
        public TV(String model, String resolution) {
            this.model = model;
            this.resolution = resolution;
            this.currentChannel = 1;
            this.volumeLevel = 50;
            this.isTurnedOn = false;
        }

        // Методы
        public void turnOn() {
            isTurnedOn = true;
            System.out.println("📺 Телевизор включён.");
        }

        public void turnOff() {
            isTurnedOn = false;
            System.out.println("📴 Телевизор выключен.");
        }

        public void increaseVolume() {
            if (volumeLevel < 100) {
                volumeLevel++;
                System.out.println("Громкость увеличена до " + volumeLevel);
            }
        }

        public void decreaseVolume() {
            if (volumeLevel > 0) {
                volumeLevel--;
                System.out.println("Громкость уменьшена до " + volumeLevel);
            }
        }

        public void changeChannel(int newChannel) {
            if (newChannel > 0) {
                currentChannel = newChannel;
                System.out.println("Переключено на канал " + currentChannel);
            }
        }

        public void displayInfo() {
            System.out.println("Модель: " + model);
            System.out.println("Разрешение: " + resolution);
            System.out.println("Канал: " + currentChannel);
            System.out.println("Громкость: " + volumeLevel);
            System.out.println("Включён: " + (isTurnedOn ? "Да" : "Нет"));
        }
    }

    // Пример использования
    public static void main(String[] args) {
        TV myTV = new TV("Samsung QLED", "4K");
        myTV.turnOn();
        myTV.displayInfo();
        myTV.changeChannel(5);
        myTV.increaseVolume();
        myTV.decreaseVolume();
        myTV.turnOff();
    }
        
}