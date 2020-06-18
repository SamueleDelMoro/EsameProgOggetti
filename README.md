# EsameProgOggetti
 Il progetto è stato realizzato mediante l'uso del sito Facebook Developers, ovvero un sito tramite il quale determinati enti, come aziende oppure utenti privati, possono ricavare informazioni riguardante le loro pagine Facebook. Questo sito ci permette di utilizzare delle API cioe applicazioni che, mediante modalità standard espongono le funzionalità di altre applicazioni ovvero il ri-utlizzo di determinati servizi; queste API vengono utilizzate mediante un software chiamato POSTMAN il quale è un software di API development che ci permette di  creare, testare, documentare, monitorare e pubblicare documentazione per le nostre API e ci permette inoltre di fornire il nostro risultato in formato JSON. Noi abbiamo realizzato questo progetto tramite un SpringBootApplication il quale poi è stata implementata in java mediante l'IDE ECLIPSE. Tramite questa SpringBootApplication, è possibile lanciare il nostro programma attraverso il nostro software Postaman che ci permette di gestire le chiamate Get e Post le quali sono:
*	Ottenere un elenco di post(GET)
*	Ottenere metadata dei post (GET)
*	Ottenere delle statistiche sui contenuti dei post in formato JSON (GET)
*	Fare dei filtri sui post della pagina ed ottenere l’elenco dei post filtrati in formato JSON(POST)
*	Integrazione del metodo precedente con l’aggiunta di statistiche sui post filtrati. (POST)

![alt text](https://github.com/SamueleDelMoro/EsameProgOggetti/blob/master/diagrammi%20UML/Esame%20Use%20Case%20Diagram.jpg)




# OBIETTIVO DEL PROGETTO
L’obiettivo del progetto è quello di ottenere mediante le chiamate GET e POST, le quali verranno definite successivamente, tutto l’elenco dei post con i relativi like con il numero complessivo di essi sotto ogni post, ed oltre questo anche la creazione di statistiche e filtri, anch’essi descritti in seguito, i quali riguardano i post e le relative caratteristiche.
# INIZIO DEL PROGRAMMA
Per poter iniziare ad utilizzare il programma e avere a disposizione tutte le funzionalità di esso, è necessario possedere un account “Facebook Developers” nel quale generare il proprio access token con i relativi permessi, noi abbiamo generato un access token di durata anch’esso con i relativi permessi. Inoltre abbiamo inserito all’interno del test della SpringBootApplication un main nel quale viene passato il sito della nostra pagina con l’access token relativo permette al programma di collegarsi, appunto, con la nostra pagina. Successivamente, una volta mandato in run il programma mediante Spring , è necessario accedere a Postaman ed inserire le relative chiamate GET e POST all’indirizzo http://localhost:8080 . Ora vediamo nello specifico le nostre richieste: 
# RICHIESTE UTILIZZATE


| TIPO 	| ROTTA | DESCRIZIONE |
| --- | --- | --- |
| GET	| /metadata	| Richiesta dei metadati dei post |
| GET | /posts	| Richiesta di tutti i post, con il relativo numero di like |
| GET | /stat	| Richiesta di tutte le statistiche riguardo i post |
| POST	| /filter 	| Esecuzione di un filtro su un post |
| POST | /stat | Esecuzione di una statistica su un post filtrato |


Una volta definite tutte le chiamate andiamo a definire tutte le possibile statistiche e i possibili filtri i quali vanno a implementare le chiamate GET e POST.

# STATISTICHE
| NOME |	OPERATORE	| DESCRIZIONE |
| --- | --- | --- |
| Avg	| /stat?spec=Avg	| Valore medio del numero dei caratteri del messaggio |
| Min	| /stat?spec=Min |	Valore minimo del numero di caratteri per post |
| Max	| /stat?spec=Max	| Valore massimo del numero di caratteri per post |
| LikeAvg | /stat?spec=LikeAvg | Valore medio del numero dei like |
| LikeMax | /stat?spec=LikeMax | Post con piu alto numero di like |
| LikeMin | /stat?spec=LikeMin | Post con piu piccolo numero di like |
| NumPost	| /stat?spec=NumPost	| Numero dei post |
| PresMult	| /stat?=PresMult	| Numero post con presenza multimediale |

# FILTRI
Per usare i filtri che abbiamo messo a disposizione, bisogna fare questa distinzione:
1. /filter?type=and per fare la and di due filtri diversi
2. /filter?type=or per fare la or di due filtri diversi
3. /filter?type=… con qualsiasi stringa o carattere diversa dalle precedenti per utilizzare un singolo filtro, purchè non sia nullo Tali stringhe saranno aggiunte a localhost:8080. Inoltre sarà possibile con l’operatore “&” eseguire una determinata statistica dopo un filtraggio(vedi par. STATISTICHE)
Inoltre ora dobbiamo definire anche gli operatori per il filtri :
# OPERATORI FILTRI
| NOME |	BODY	| DESCRIZIONE |
| --- | --- | --- |
| Gt	| {“Gt”:[“x”]}	| Post con numero caratteri maggiori di x |
| Lt	| {“Lt”:[“x”]}	| Post con numero caratteri minori di x |
| Bt	| {“Bt”:[“x”, “y”]} |	Post con numero caratteri compresi tra x e y |
| In | {"In":["contenuto cercato"]} | Post aventi il contenuto cercato nel messaggio |
| LikeBt | {"LikeBt":["x","y"]} | Post con numero di like compresi tra x e y
| LikeGt | {"LikeGt":["x"]} | Post con numero di like maggiori di x
| LikeLt | {"LikeLt":["x"]} | Post con numero di like minori di x
| LikeIn | {"LikeIn":["x"]} | Post avente quel preciso valore di like (x)
| InMessage	| {“InMessage”:[“stringa cercata”]}	| Post aventi nel message la stringa cercata |
| TimeAfter | {“TimeAfter”:[“yyyy-mm-dd”]}	| Post pubblicati successivamente rispetto a una data scelta dall'utente |
| TimeBefore	| {“TimeBefore”:[“yyyy-mm-dd”]}	| Post pubblicati prima rispetto a una data scelta dall'utente |
| TimeEqual	| {“TimeEqual”:[“yyyy-mm-dd”]}	| Post pubblicati in una data scelta dall'utente |

# DIAGRAMMA DELLE CLASSI
## PACKAGE

![alt text](https://github.com/SamueleDelMoro/EsameProgOggetti/blob/master/diagrammi%20UML/Esame.jpg)

## APPLICATION

![alt text](https://github.com/SamueleDelMoro/EsameProgOggetti/blob/master/diagrammi%20UML/Esame%20Application.jpg)

## CONTROLLER


![alt text](https://github.com/SamueleDelMoro/EsameProgOggetti/blob/master/diagrammi%20UML/Controller.jpg)

## MODEL

![alt text](https://github.com/SamueleDelMoro/EsameProgOggetti/blob/master/diagrammi%20UML/Model.jpg)

## STAT
![alt text](https://github.com/SamueleDelMoro/EsameProgOggetti/blob/master/diagrammi%20UML/Stat.jpg)


![alt text](http://url/to/img.png)


## FILTER

![alt text](https://github.com/SamueleDelMoro/EsameProgOggetti/blob/master/diagrammi%20UML/Filter.jpg)

## EXCEPTION

![alt text](https://github.com/SamueleDelMoro/EsameProgOggetti/blob/master/diagrammi%20UML/Exception.jpg)

## SERVICE

![alt text](https://github.com/SamueleDelMoro/EsameProgOggetti/blob/master/diagrammi%20UML/Service.jpg)

## UTIL

![alt text](https://github.com/SamueleDelMoro/EsameProgOggetti/blob/master/diagrammi%20UML/Util.jpg)



