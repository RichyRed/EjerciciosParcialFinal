package ejerciciosParcialFinal.ejercicio5;

public class Client {
    public static void main(String[] args){
        IEmpresa1 android = new Android("Aplicacion android");
        android.login();

        IEmpresa1 ios = new IOS("Aplicacion IOS");
        ios.logout();

        IEmpresa1 windowsP = new Android("Aplicacion windowsP");
        windowsP.reporte();

        IEmpresa1 web = new Artefacto(new AplicacionWeb("Aplicacion web"));
        web.login();

        IEmpresa1 escritorio = new Artefacto(new AplicacionEscritorio("Aplicacion escritorio"));
        escritorio.logout();
    }
}
