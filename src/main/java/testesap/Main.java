package testesap;


public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando pruebas...");

        // Construcción de la solicitud de pruebas
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectClass(TestsPorsche.class)) // Clase de pruebas
                .build();

        // Ejecución de las pruebas
        Launcher launcher = LauncherFactory.create();
        launcher.execute(request);

        System.out.println("Pruebas completadas.");
    }
}
