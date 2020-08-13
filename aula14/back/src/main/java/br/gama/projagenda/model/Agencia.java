package br.gama.projagenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itmn032_agencia")
public class Agencia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome_agencia", length=100)
    private String nomeagencia;

    @Column(name="hora_inicio")
    private int horainicio;
    
    @Column(name="hora_fim")
	private int horafim;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeagencia() {
        return nomeagencia;
    }

    public void setNomeagencia(String nomeagencia) {
        this.nomeagencia = nomeagencia;
    }

    public int getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(int horainicio) {
        this.horainicio = horainicio;
    }

    public int getHorafim() {
        return horafim;
    }

    public void setHorafim(int horafim) {
        this.horafim = horafim;
    }

}