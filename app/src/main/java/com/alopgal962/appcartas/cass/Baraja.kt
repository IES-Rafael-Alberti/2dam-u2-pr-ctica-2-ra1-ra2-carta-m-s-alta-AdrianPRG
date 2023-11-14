package com.alopgal962.appcartas.cass

class Baraja {

    companion object{
        var listacartas=ArrayList<Carta>()

        fun crearbaraja(){
            var naipes=Naipes.values()
            var palos=Palos.values()
            var contador=1
            for (palo in palos){
                contador=1
                for (numero in naipes){
                    if (contador==1){
                        var cartaAS=Carta(palo,numero,contador,contador,"ace_of_$palo")
                        listacartas.add(cartaAS)
                    }
                    else if (contador==12){
                        var carta11=Carta(palo,numero,contador,contador,"jack_of_$palo ")
                        listacartas.add(carta11)
                    }
                    else if(contador==13){
                        var carta12=Carta(palo,numero,contador,contador,"queen_of_$palo")
                        listacartas.add(carta12)
                    }
                    else if (contador==14){
                        var carta13=Carta(palo,numero,contador,contador,"king_of_$palo")
                        listacartas.add(carta13)
                    }
                    else{
                        var carta=Carta(palo,numero,contador,contador,"$palo$contador")
                        listacartas.add(carta)
                    }
                    contador+=1
                }
            }
            println(listacartas)
        }

        fun damecarta():Carta{
            return listacartas.last()
        }
    }


}