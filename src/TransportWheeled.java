public abstract class TransportWheeled implements Transport {
    private final String modelName;
    private final int wheelsCount;

    public TransportWheeled(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void servise() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
