public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        EditorVideo ed = new EditorVideo();
        ed.setSalario(2500);

        Designer d = new Designer();
        d.setSalario(2500);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g1);
        controle.registra(ed);
        controle.registra(d);
        System.out.println(controle.getSoma());
    }
}
