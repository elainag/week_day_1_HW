public class WaterBottle {

    private Boolean status;
    private int volume;
    private int drink;

    public WaterBottle(Boolean status, int volume, int drink) {
        this.status = status;
        this.volume = volume;
        this.drink = drink;
    }

    public boolean getVolStatus() {
        return status = true;
    }

    public int getVolume(int num) {
        return num;
    }

    public int takeDrink(int drink) {
       return this.volume - drink;
    }

    public int setEmpty(int num){
        return this.volume - num;
    }

    public int fillBottle(int num) {
        var emptyBottle = this.volume - num;
                return emptyBottle + num;
    }
}
