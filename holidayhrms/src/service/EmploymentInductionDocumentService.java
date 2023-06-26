package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO_Interfaces.EmploymentInductionDocumentDAO;
import models.EmploymentInductionDocument;
import models.input.output.EmploymentInductionDocumentViewModel;
import service_interfaces.EmploymentInductionDocumentServiceInterface;

@Service
public class EmploymentInductionDocumentService implements EmploymentInductionDocumentServiceInterface {
	@Autowired
	private EmploymentInductionDocumentDAO docDAO;

	public void addEmploymentInductionDocument(EmploymentInductionDocument document) {
		docDAO.addEmploymentInductionDocument(document);
	}

	public String getEmploymentInductionDocumentFile(int documentIndex) {
		EmploymentInductionDocument document = docDAO.getEmploymentInductionDocument(documentIndex);

		String fileData = document.getDocumentData();

		return fileData;
	}

	public List<EmploymentInductionDocumentViewModel> getAllDocuments() {
		return docDAO.getAllDocuments();
	}

}
