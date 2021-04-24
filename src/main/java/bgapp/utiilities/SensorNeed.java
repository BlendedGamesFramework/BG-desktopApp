/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bgapp.utiilities;

import java.util.ArrayList;
import mod.sensors.Observer;

/**
 *
 * @author InTEracTIon User
 */
public class SensorNeed {
        private String sensorVersion;
        private String sensorCategory;
        private String sensorDescription;
        private ArrayList<AttributePlayer> listOfAttributes ;
        private int PlayerId ;
        private String Host;
        public ArrayList<Observer> Observers;
        private String sensorName;
        public SensorNeed(){
            this.sensorVersion = null;
            this.sensorCategory=null;
            this.sensorDescription=null;
            this.listOfAttributes = new ArrayList<>();
            this.PlayerId =0;
            this.Host = null;
            this.Observers = new ArrayList();
        }
        public SensorNeed(String NameApp,String VER,String Cat,String Des,ArrayList<AttributePlayer> LISTATT,int PlayerID,String Host,ArrayList<Observer> Obs){
            this.sensorName = NameApp;
            this.sensorVersion = VER;
            this.sensorCategory=Cat;
            this.sensorDescription=Des;
            this.listOfAttributes = LISTATT;
            this.PlayerId = PlayerID;
            this.Host = Host;
            this.Observers = Obs;
        }
        
        /*La función notify existe para informar a la aplicación principal o los observadores que se encuentren
        sobre un atributo específico.
        El atributo enviado debe ser uno procesado, por ejemplo, si alguien se mantiene
        concentrado mucho tiempo, gana un punto de "resistencia cognitiva" y este puntaje
        se puede almacenar luego en la Base de datos o puede ser utilizado cuando el
        jugador lo considere mejor. (Atributo capturado como característica)
        */
        public void notify(AttributePlayer AP) {
            Observers.forEach((o) -> {
                o.update(AP);
            });
        }
        public void notifyOK() {
            Observers.forEach((o) -> {
                o.update();
            });
        }
        
        /**
         * @return the sensorVersion
         */
        public String getSensorVersion() {
            return sensorVersion;
        }

        /**
         * @param sensorVersion the sensorVersion to set
         */
        public void setSensorVersion(String sensorVersion) {
            this.sensorVersion = sensorVersion;
        }

        /**
         * @return the sensorCategory
         */
        public String getSensorCategory() {
            return sensorCategory;
        }

        /**
         * @param sensorCategory the sensorCategory to set
         */
        public void setSensorCategory(String sensorCategory) {
            this.sensorCategory = sensorCategory;
        }

        /**
         * @return the sensorDescription
         */
        public String getSensorDescription() {
            return sensorDescription;
        }

        /**
         * @param sensorDescription the sensorDescription to set
         */
        public void setSensorDescription(String sensorDescription) {
            this.sensorDescription = sensorDescription;
        }

        /**
         * @return the listOfAttributes
         */
        public ArrayList<AttributePlayer> getListOfAttributes() {
            return listOfAttributes;
        }

        /**
         * @param listOfAttributes the listOfAttributes to set
         */
        public void setListOfAttributes(ArrayList<AttributePlayer> listOfAttributes) {
            this.listOfAttributes = listOfAttributes;
        }

        /**
         * @return the PlayerId
         */
        public int getPlayerId() {
            return PlayerId;
        }

        /**
         * @param PlayerId the PlayerId to set
         */
        public void setPlayerId(int PlayerId) {
            this.PlayerId = PlayerId;
        }

        /**
         * @return the Host
         */
        public String getHost() {
            return Host;
        }

        /**
         * @param Host the Host to set
         */
        public void setHost(String Host) {
            this.Host = Host;
        }
        
        
        /**
         * @return the sensorName
         */
        public String getSensorName() {
            return sensorName;
        }

        /**
         * @param sensorName the sensorName to set
         */
        public void setSensorName(String sensorName) {
            this.sensorName = sensorName;
        }
        
        
    }
