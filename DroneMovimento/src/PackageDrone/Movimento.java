package PackageDrone;
import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Movimento {
    private TipoMovimento tipo;
    private LocalDateTime dataHorario;
    private Drone drone;

    public Movimento() {
    }

    public Movimento(TipoMovimento tipo, LocalDateTime dataHorario, Drone drone) {
        this.tipo = tipo;
        this.dataHorario = dataHorario;
        this.drone = drone;
        this.movimentar();
    }

    public TipoMovimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimento tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(LocalDateTime dataHorario) {
        this.dataHorario = dataHorario;
    }

    public Drone getDrone() {
        return drone;
    }

    public void setDrone(Drone drone) {
        this.drone = drone;
    }

    @Override
    public String toString() {

        DateTimeFormatter BR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraBR = dataHorario.format(BR);
        return "Movimento:\n" +
                "tipo: " + tipo +
                ", dataHorario: " + dataHoraBR +
                ", Drone = \n[" + drone + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movimento movimento = (Movimento) o;
        return tipo == movimento.tipo && Objects.equals(dataHorario, movimento.dataHorario) && Objects.equals(drone, movimento.drone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, dataHorario, drone);
    }

    public void movimentar(){
        switch (this.tipo){
            case DECOLAR:
                JOptionPane.showMessageDialog(null, "O drone está voando agora");
                this.drone.setVoando(true);
                break;
            case FRENTE:
                if (this.drone.getVoando()){
                    this.drone.setPosY(drone.getPosY() + 1);
                } else {
                    JOptionPane.showMessageDialog(null, "O drone não decolou");
                }
                break;
            case TRAZ:
                if (this.drone.getVoando()){
                    this.drone.setPosY(drone.getPosY() - 1);
                } else {
                    JOptionPane.showMessageDialog(null, "O drone não decolou");
                }
                break;
            case ESQUERDA:
                if (this.drone.getVoando()){
                    this.drone.setPosX(drone.getPosX() - 1);
                } else {
                    JOptionPane.showMessageDialog(null, "O drone não decolou");
                }
                break;
            case DIREITA:
                if (this.drone.getVoando()){
                    this.drone.setPosX(drone.getPosX() + 1);
                } else {
                    JOptionPane.showMessageDialog(null, "O drone não decolou");
                }
                break;
            case POUSAR:
                if (this.drone.getVoando()){
                    this.drone.setVoando(false);
                } else {
                    JOptionPane.showMessageDialog(null, "O drone não decolou");
                }
                break;
        }
    }
}
