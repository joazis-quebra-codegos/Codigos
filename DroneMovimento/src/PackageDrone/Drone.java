package PackageDrone;

import java.util.Objects;

public class Drone {
    private Long numSerie;
    private String marca;
    private Integer posX;
    private Integer posY;
    private Boolean voando;

    public Drone(Long numSerie, String marca, Integer posX, Integer posY, Boolean voando) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.posX = posX;
        this.posY = posY;
        this.voando = voando;
    }

    public Boolean getVoando() {
        return voando;
    }

    public void setVoando(Boolean voando) {
        this.voando = voando;
    }

    public Long getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(Long numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPosX() {
        return posX;
    }

    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    public Integer getPosY() {
        return posY;
    }

    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Drone:\n" +
                "numSerie: " + numSerie +
                ", marca: '" + marca +
                ", posX: " + posX +
                ", posY: " + posY +
                ", voando: " + voando;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Drone drone = (Drone) o;
        return Objects.equals(numSerie, drone.numSerie);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numSerie);
    }
}