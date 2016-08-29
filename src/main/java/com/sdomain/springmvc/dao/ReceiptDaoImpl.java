package com.sdomain.springmvc.dao;

import com.sdomain.springmvc.model.Receipt;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("receiptDao")
public class ReceiptDaoImpl extends AbstractDao<Integer, Receipt> implements ReceiptDao {

	public Receipt findById(int id) {
		return getByKey(id);
	}

	public void saveReceipt(Receipt receipt) {
		persist(receipt);
	}

	public void deleteReceiptById(String id) {
		Query query = getSession().createSQLQuery("delete from Receipt where id = :id");
		query.setString("id", id);
		query.executeUpdate();
	}

	public List<Receipt> findAllReceipts() {
		return createEntityCriteria().list();
	}

	public Receipt findEmployeeByTag(String tag) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.like("tag", tag));
		return (Receipt) criteria.list();
	}
}
