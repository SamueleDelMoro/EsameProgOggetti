package com.esame.EsameProgOgg.filter;

import java.util.ArrayList;


import com.esame.EsameProgOgg.exception.BetweenException;
import com.esame.EsameProgOgg.model.Post;
/**
 * <p>
 * <b> Interfaccia filtro </b>
 * <p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public interface Filter {
/**
 * metodo di filtraggio
 * @return un arrayList di post filtrati
 * @throws BetweenException
 */
	public  ArrayList<Post> doFilter() throws BetweenException;
}