package atividade03;


public class Horario 
{
    private int hora;
    private int minuto;
    private int segundo;


    public Horario(int hora, int minuto, int segundo)
    {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }


    public void setHora(int hora)
    {
        if(hora >= 0 && hora <= 23)
        {
            this.hora = hora;
        }
    }


    public void setMinuto(int minuto)
    {
        if(minuto >= 0 && minuto <= 60)
        {
            this.minuto = minuto;
        }
    }


    public void setSegundo(int segundo)
    {
        if(segundo >= 0 && segundo <= 60)
        {
            this.segundo = segundo;
        }
    }


    public int getHora()
    {
        return this.hora;
    }


    public int getMinuto()
    {
        return this.minuto;
    }


    public int getSegundo()
    {
        return this.segundo;
    }


    public void incrementarHorario()
    {
        if(this.segundo < 59)
        {
            this.segundo++;
        }else
        {
            if(this.minuto < 59)
            {
                this.minuto++;
                this.segundo = 0;
            }else
            {
                if(this.hora <= 22)
                {
                    this.hora++;
                    this.minuto = 0;
                    this.segundo = 0;
                }else
                {
                    this.hora = 0;
                    this.minuto = 0;
                    this.segundo = 0;
                }
            }
        }
    }



    public void mostrarHorario()
    {
        String hora_str = String.format("%02d", this.hora);
        String minuto_str = String.format("%02d", this.minuto);
        String segundo_str = String.format("%02d", this.segundo);

        System.out.printf("%s:%s:%s\n", hora_str, minuto_str, segundo_str);
    }
    
}
