class Laptop extends Computer implements tradable{
    int screenDiagonal;
    Laptop(int cores){
        this.numberOfCores = cores;
        this.networkChip = new NetworkChip(Connector.WIRELESS);
        this.screenDiagonal = 4;
    }

    @Override
    public int giveSalePrice() {
        return factor*this.numberOfCores;
    }
}
