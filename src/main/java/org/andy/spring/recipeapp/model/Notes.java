package org.andy.spring.recipeapp.model;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @Column(name = "N_ID")
    private Long id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "N_ID")
    private Recipe recipe;

    @Lob
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
