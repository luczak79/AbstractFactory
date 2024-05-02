public class PerennialGarden implements Garden {
    public Plant getShade() {
        return new Plant("Astilbe");
    }
    public Plant getCenter() {
        return new Plant("Dicentrum");
    }
    public Plant getBorder() {
        return new Plant("Sedum");
    }

}
