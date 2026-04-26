public class Carro {

    private Ignicao ignicao;
    private int velocidade;
    private int marcha;

    public Carro(Ignicao ignicao, int velocidade, int marcha){
        this.ignicao = Ignicao.DESLIGADO;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public Carro() {

    }

    public Ignicao getIgnicao() {
        return ignicao;
    }

    public void setIgnicao(Ignicao ignicao) {
        this.ignicao = ignicao;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void ligarCarro(){
        ignicao = Ignicao.LIGADO;
    }

    public void desligarCarro(){
        if (getMarcha() == 0 && getVelocidade() == 0){
            ignicao = Ignicao.DESLIGADO;
        } else {
            System.out.println("O carro só pode ser deligado no ponto morte e velocidade 0");
        }
    }

    public void acelerar(){
        if (ignicao == Ignicao.DESLIGADO){
            System.out.println("O carro está desligado");
        } else if (getVelocidade() <= 120){
            velocidade++;
        } else if (getVelocidade() >= 120){
            System.out.println("O carro chegou ao limite de velocidade");
        }
    }

    public void desacelerar(){
        if (ignicao == Ignicao.DESLIGADO){
            System.out.println("O carro está desligado");
        } else if (getVelocidade() >= 0){
            velocidade--;
        } else if (getVelocidade() <= 0){
            System.out.println("O carro já esta parado");
        }
    }

    public void virar(){
        if (getVelocidade() >= 1 && getVelocidade() <= 40){
            System.out.println("O carro está virando");
        } else {
            System.out.println("Para virar o carro deve estar entre 1 e 40km");
        }
    }

    public void trocarMarcha(){
        if (getIgnicao() == Ignicao.DESLIGADO && getMarcha() == 0){
            System.out.println("Não é possível trocar de marcha c o carro desligado");
        } else if(getVelocidade() == 0){
            marcha = 0;
        }else if (getVelocidade() > 0 && getVelocidade() <= 20){
            marcha = 1;
        } else if (getVelocidade() >= 21 && getVelocidade() <= 40){
            marcha = 2;
        } else if (getVelocidade() >= 41 && getVelocidade() <= 60){
            marcha = 3;
        } else if (getVelocidade() >= 61 && getVelocidade() <= 80){
            marcha = 4;
        } else if (getVelocidade() >= 81 && getVelocidade() <= 100){
            marcha = 5;
        } else if (getVelocidade() >= 101 && getVelocidade() <= 120){
            marcha = 6;
        }
    }
}
