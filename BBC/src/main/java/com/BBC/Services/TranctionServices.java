package com.BBC.Services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.BBC.Dao.TranctionDao;
import com.BBC.Entiity.Customer;
import com.BBC.Entiity.PaymentMode;
import com.BBC.Entiity.Tranction;

@Service
public class TranctionServices {
	@Autowired
	TranctionDao tranctionDao;

	private Date date = new Date();

	public List<Tranction> getAlltranction() {
		return tranctionDao.getAlltranction();
	}

	public List<Tranction> getAlltranctionByIdForPending(long id) {
		List<Tranction> list = tranctionDao.getAllTransaction();
		List<Tranction> newList = new ArrayList<>();
		for (Tranction tranction : list) {
			Customer customer = tranction.getCustomer();
			if (customer.getCid() == id && tranction.getStatus().equals("pending")) {

				newList.add(tranction);
			}
		}
		return newList;
	}

	public String setAlltranctionByIdAndPaymentId(long id, long tId, long pId) {
		if (pId == 0) {
			return "Not a valid Id. Please check id";
		} else {
			List<Tranction> list = tranctionDao.getAllTransaction();
			for (Tranction tranction : list) {
				Customer customer = tranction.getCustomer();
				PaymentMode paymentMode = tranction.getPaymentMode();
				if (pId == 2) {
					paymentMode.setDiscount(5);
				}
				if (customer.getCid() == id && tranction.getStatus().equals("pending") && tranction.getTid() == tId) {
					paymentMode.setId(pId);

					System.out.println(paymentMode.getDiscount());

					tranction.setTotalAmount(paymentMode.getRate() * tranction.getUnitConsumption()
							- ((paymentMode.getRate() * paymentMode.getDiscount() * tranction.getUnitConsumption())
									/ 100));

					System.out.println(tranction.getTotalAmount());

					if ((date.before(tranction.getEnddate()) && date.after(tranction.getStartdate()))
							|| (date.equals(tranction.getEnddate()))) {

						tranction.setTotalAmount(paymentMode.getRate() * tranction.getUnitConsumption()
								- ((paymentMode.getRate() * 5 * tranction.getUnitConsumption()) / 100));
						System.out.println(tranction.getTotalAmount());
					}
					return tranctionDao.setAllTransactionUpdate(tranction);
				}
			}
			return "Not a valid entry";
		}
	}

	public List<Tranction> getAlltranctionBill(long id, long tId) {
		List<Tranction> list = tranctionDao.getAllTransaction();
		List<Tranction> newList = new ArrayList<>();
		for (Tranction tranction : list) {
			Customer customer = tranction.getCustomer();
			if (customer.getCid() == id && tranction.getTid() == tId) {
				newList.add(tranction);
			}
		}
		return newList;
	}

	public String getAlltranctionPaymentUpdate(long id, long tId) {

		List<Tranction> list = tranctionDao.getAllTransaction();
		for (Tranction tranction : list) {
			Customer customer = tranction.getCustomer();
			PaymentMode paymentMode = tranction.getPaymentMode();
			if (customer.getCid() == id && tranction.getTid() == tId && tranction.getStatus().equals("pending")) {
				tranction.setStatus("success");
				return tranctionDao.getAlltranctionPaymentUpdate(tranction);
			}
		}
		return " Payment is already done";
	}

}
