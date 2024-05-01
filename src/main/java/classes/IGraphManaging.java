/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author DELL
 */
public interface IGraphManaging {
    // Méthode pour créer un graphe avec un nom spécifié
    void createGraph(String name);

    // Méthode pour mettre à jour un graphe avec un nom spécifié et un nouveau graphe
    @SuppressWarnings("NonPublicExported")
    void updateGraph(String name, Graph graph);

    // Méthode pour supprimer un graphe avec un nom spécifié
    void deleteGraph(String name);
}