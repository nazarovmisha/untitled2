public class DefaultEngineImpl implements IEngine {

    private float engineRotation = 0;

    @Override
    public float getEngineRotation() {
        return engineRotation;
    }

    @Override
    public void setFuelConsumptionRate(float FUEL_FLOW) {
        engineRotation = FUEL_FLOW * 1.25f;
    }
}
