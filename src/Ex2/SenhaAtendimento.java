package Ex2;

    public class SenhaAtendimento {
        int senha;
        String paciente;
        static int controle=100;


        public SenhaAtendimento(String paciente){
            this.paciente = paciente;
            this.senha = controle++;
        }

        public String capturaDados(){
            return "Paciente:"+paciente+" || Senha:"+senha;
        }
    }