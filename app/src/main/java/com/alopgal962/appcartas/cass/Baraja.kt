package com.alopgal962.appcartas.cass

class Baraja {

    var listacartas=ArrayList<Carta>()
    var listacartasyapasada=ArrayList<Carta>()

    fun crearbaraja(){
        var naipes=Naipes.values()
        var palos=Palos.values()
        var contador=0
        for (palo in palos){
            contador=0
            for (numero in naipes){
                contador+=1
                if (contador==1){
                    var cartaAS=Carta(palo,numero,contador,contador,"ace_of_$palo")
                    listacartas.add(cartaAS)
                }
                else if (contador==11){
                    var carta11=Carta(palo,numero,contador,contador,"jack_of_$palo ")
                    listacartas.add(carta11)
                }
                else if(contador==12){
                    var carta12=Carta(palo,numero,contador,contador,"queen_of_$palo")
                    listacartas.add(carta12)
                }
                else if (contador==13){
                    var carta13=Carta(palo,numero,contador,contador,"king_of_$palo")
                    listacartas.add(carta13)
                }
                else{
                    var carta=Carta(palo,numero,contador,contador,"$palo$contador")
                    listacartas.add(carta)
                }
            }
        }
        println(listacartas)
    }

    fun barajar(){
        listacartas.shuffle()
    }
    fun damecarta():String{
        var id=""
        if (listacartas.isEmpty()){
            crearbaraja()
        }
        id = listacartas.last().iddrawable
        listacartas.removeAt(listacartas.size - 1)
        return id
    }

}