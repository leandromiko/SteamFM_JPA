/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 31424635
 */
public interface GenericoDAO<E> extends Serializable {

    public void create(E e);

    public List<E> read();

    public void update(E e);

    public void delete(int id);

}
