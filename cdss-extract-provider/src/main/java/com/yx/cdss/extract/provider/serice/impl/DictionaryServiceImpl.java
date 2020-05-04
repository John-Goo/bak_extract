package com.yx.cdss.extract.provider.serice.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yx.cdss.extract.model.entity.DictDrug;
import com.yx.cdss.extract.model.entity.DictDrugExample;
import com.yx.cdss.extract.model.mapper.DictDrugMapper;
import com.yx.cdss.extract.provider.serice.dict.DictionaryService;

@Service("dictionaryService")
public class DictionaryServiceImpl implements  DictionaryService{ 
	
	@Resource
	private DictDrugMapper dictDrugMapper;

	@Override
	public List<DictDrug> queryDictDrug(String drugCode) {
		DictDrugExample criteria = null;
		if(drugCode !=null) {
			 criteria = new DictDrugExample();
			criteria.createCriteria().andDrugCodeEqualTo(drugCode);
		}
		
		return dictDrugMapper.selectByExample(criteria);
	}

	@Override
	public void insert(DictDrug dictDrug) {
		dictDrugMapper.insert(dictDrug);
	}

}
