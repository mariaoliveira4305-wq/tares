import java.util.ArrayList;

public class SistemaBemEstar {

    private ArrayList<RegistroBemEstar> registros;

    public SistemaBemEstar() {
        registros = new ArrayList<>();
    }

    public void adicionarRegistro(RegistroBemEstar registro) {
        registros.add(registro);
    }

    public String listarRegistros() {

        if (registros.isEmpty()) {
            return "Nenhum registro encontrado.";
        }

        StringBuilder sb = new StringBuilder();

        for (RegistroBemEstar r : registros) {
            sb.append(r.toString()).append("\n");
        }

        return sb.toString();
    }
}