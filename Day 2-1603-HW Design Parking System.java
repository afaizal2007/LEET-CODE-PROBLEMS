class ParkingSystem {
    private int[] count;
    public ParkingSystem(int big, int medium, int small) {
        this.count = new int[]{0, big, medium, small};
    }
    public boolean addCar(int carType) { 
        if (this.count[carType] > 0) {
            this.count[carType]--;
            return true;
        }
        return false;
    }
}
