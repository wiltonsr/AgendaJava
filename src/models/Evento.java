package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Evento {

    private String nomeEvento;
    private Date dataInicio;
    private Date dataFim;
    private int horaInicio;
    private int minInicio;
    private int horaFim;
    private int minFim;
    private String localEvento;
    private String Descricao;
    
    public Evento(String nomeEvento, Date dataInicio, Date dataFim, int horaInicio, int minInicio, int horaFim, int minFim, String localEvento, String Descricao) {
        this.nomeEvento = nomeEvento;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horaInicio = horaInicio;
        this.minInicio = minInicio;
        this.horaFim = horaFim;
        this.horaInicio = horaInicio;
        this.localEvento = localEvento;
        this.Descricao = Descricao;
    }
    
    public Evento(String nomeEvento, Date dataInicio, Date dataFim) {
        this.nomeEvento = nomeEvento;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    
    public Evento(String nomeEvento){
        this.nomeEvento = nomeEvento;
    }
    
    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getMinInicio() {
        return minInicio;
    }

    public void setMinInicio(int minInicio) {
        this.minInicio = minInicio;
    }

    public int getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }

    public int getMinFim() {
        return minFim;
    }

    public void setMinFim(int minFim) {
        this.minFim = minFim;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
    
    public String dataInicioToString(){
        String dataInicioFormatada = new SimpleDateFormat("dd/MM/yyyy").format(this.dataInicio); 
 
        return(dataInicioFormatada.toString() + " às " + this.horaInicio + "h" + this.minInicio + "min"); 
    }
    
    public String dataFimToString(){
        String dataFimFormatada = new SimpleDateFormat("dd/MM/yyyy").format(this.dataFim); 
        
        return(dataFimFormatada.toString() + " às " + this.horaFim + "h" + this.minFim + "min"); 
    }
    
    public String apenasDataInicioToString(){
        String dataInicioFormatada = new SimpleDateFormat("dd/MM/yyyy").format(this.dataInicio); 
        
        return(dataInicioFormatada);
    }
}