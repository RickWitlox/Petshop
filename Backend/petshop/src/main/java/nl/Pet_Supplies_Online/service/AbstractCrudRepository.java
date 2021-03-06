package nl.Pet_Supplies_Online.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * @author Erwin de Gier
 * @param <T>
 *            The entity to use the CRUD on.
 */

public abstract class AbstractCrudRepository<T> {
    @PersistenceContext
    EntityManager entityManager;

    protected abstract Class<T> getEntityClass();

    public T persist(T entity) {
        this.entityManager.persist(entity);
        return entity;
    }

    public T merge(T entity) {
        return this.entityManager.merge(entity);
    }

    public void remove(T entity) {
        T attached = this.entityManager.merge(entity);
        this.entityManager.remove(attached);
    }

    public T find(int key) {
        return this.entityManager.find(getEntityClass(), key);
    }

    public List<T> findAll() {
        CriteriaQuery<T> cq = entityManager.getCriteriaBuilder().createQuery(
                this.getEntityClass());
        return entityManager.createQuery(
                cq.select(cq.from(this.getEntityClass()))).getResultList();
    }

}