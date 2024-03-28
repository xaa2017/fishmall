package com.cat.fishmall.nosql.elasticsearch.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/28
 * @Version: V1.0
 * @Description:
 **/
@Data
@Document(indexName = "pms", type = "product",shards = 1,replicas = 0)
public class EsProduct {

	@Id
	private Long id;

	@Field(type = FieldType.Keyword)
	private String productSn;

	private Long brandId;

	@Field(type = FieldType.Keyword)
	private String brandName;

	private Long productCategoryId;

	/**
	 * @see org.springframework.data.elasticsearch.annotations.FieldType.Keyword 不会进行分词，直接存储完整数据L
	 */
	@Field(type = FieldType.Keyword)
	private String productCategoryName;

	private String pic;

	/**
	 * @see org.springframework.data.elasticsearch.annotations.FieldType.Text 会进行分词并建了索引的字符类型
	 */
	@Field(analyzer = "ik_max_word", type = FieldType.Text)
	private String name;

	/**
	 * ik_smart 分析器：该分析器使用智能分词算法，能够将文本进行较为准确的分词处理。它会尽可能地将文本切分成有意义的词语，适用于一般的全文搜索场景。
	 *
	 * ik_max_word 分析器：该分析器使用细粒度的分词算法，会将文本进行最细粒度的切分，生成更多的词语。它适用于需要更精确的分词结果，例如语义分析和文本挖掘等场景。
	 *
	 * ik_smart_pinyin 分析器：该分析器在进行智能分词的同时，还会生成拼音信息。它可以将中文文本转换为拼音，并将拼音作为额外的分词结果进行索引和搜索。
	 *
	 * ik_max_word_pinyin 分析器：该分析器在进行细粒度分词的同时，也会生成拼音信息。它适用于需要更精确的分词和拼音结果的场景。
	 */
	@Field(analyzer = "ik_max_word", type = FieldType.Text)
	private String subTitle;

	@Field(analyzer = "ik_max_word", type = FieldType.Text)
	private String keywords;

	private BigDecimal price;

	private Integer sale;

	private Integer newStatus;

	private Integer recommandStatus;

	private Integer stock;

	private Integer promotionType;

	private Integer sort;

	@Field(type = FieldType.Nested)
	private List<EsProductAttributeValue> attrValueList;
}
