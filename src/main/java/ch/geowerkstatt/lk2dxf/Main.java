package ch.geowerkstatt.lk2dxf;

public final class Main {
    private static final String VERSION;

    static {
        String packageVersion = Main.class.getPackage().getImplementationVersion();
        VERSION = packageVersion != null ? packageVersion : "unknown";
    }

    private Main() { }

    /**
     * Application entry point.
     */
    public static void main(String[] args) {
        System.out.println("lk2dxf " + VERSION);
    }
}
