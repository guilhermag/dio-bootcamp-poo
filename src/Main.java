import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("como dancar", "curso sobre como dancar", 50);
        Curso cursoJs = new Curso("Javascript I", "conceitos basicos de javascript", 8);
        Mentoria mentoriaJava = new Mentoria("Mentoria Java I", "mentoria explicando os conceitos " +
                "basicos da linguagem");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Titulo do bootcamp");
        bootcamp.setDescricao("descricao bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devGuilherme = new Dev("Guilherme");
        System.out.println(devGuilherme.getConteudosInscritos());
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println(devGuilherme.getConteudosInscritos());

        Dev devBruna = new Dev("Bruna");
        System.out.println(devBruna.getConteudosInscritos());
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println(devBruna.getConteudosInscritos());


    }

}
