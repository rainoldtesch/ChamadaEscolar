import models.Aluno;
import models.Presenca;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws ParseException {
        Aluno carlos = new Aluno("Carlos");
        Aluno daniela = new Aluno("Daniela");
        Aluno douglas = new Aluno("Douglas");
        Aluno roberto = new Aluno("Roberto");
        Aluno feriado = new Aluno(" * F E R I A D O *");

        List<Aluno> chamada1 = List.of(carlos,daniela,roberto);
        List<Aluno> chamada2 = List.of(carlos,daniela,douglas,roberto);
        List<Aluno> chamada3 = List.of(feriado);
        List<Aluno> chamada4 = List.of(daniela,douglas);

        Presenca presencas1 = new Presenca("10/10/2022", chamada1);
        Presenca presencas2 = new Presenca("11/10/2022", chamada2);
        Presenca presencas3 = new Presenca("12/10/2022", chamada3);
        Presenca presencas4 = new Presenca("13/10/2022", chamada4);

        Map<String, Presenca> presencas = new HashMap<>();
        presencas.put("10/10/2022", presencas1);
        presencas.put("11/10/2022", presencas2);
        presencas.put("12/10/2022", presencas3);
        presencas.put("13/10/2022", presencas4);

        for (String dia : presencas.keySet()) {
            List<Aluno> alunos = presencas.get(dia).getAlunos();

            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println("Presenças do dia: " + dia);
            alunos.forEach(aluno -> System.out.print(aluno.getNome() + ", "));
            System.out.println('\n');
        }
    }
}
