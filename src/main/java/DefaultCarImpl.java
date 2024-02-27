public class DefaultCarImpl implements ICar {
    private IEngine engine = new DefaultEngineImpl();

    @Override
    public float getSpeed() {
        return engine.getEngineRotation() * 1.25f;
    }

    @Override
    public void setPedalPleasure(float PEDAL_PLEASURE) {
engine.setFuelConsumptionRate(PEDAL_PLEASURE);
    }
}
