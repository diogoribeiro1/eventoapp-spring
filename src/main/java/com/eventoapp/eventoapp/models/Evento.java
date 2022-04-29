package com.eventoapp.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Evento")
public class Evento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="codigo")
	private long codigo;
	
	@org.hibernate.validator.constraints.NotEmpty
	@Column(name="nome")
	private String nome;
	
	@org.hibernate.validator.constraints.NotEmpty
	@Column(name="local")
	private String local;
	
	@org.hibernate.validator.constraints.NotEmpty
	@Column(name="data")
	private String data;
	
	@org.hibernate.validator.constraints.NotEmpty
	@Column(name="horario")
	private String horario;
	
	@OneToMany
	private List<Convidado> convidados;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
}
