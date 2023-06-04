public abstract class TransportEngine extends TransportWheeled {

    public TransportEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void servise() {
        super.servise();
        checkEngine();
    }
}
