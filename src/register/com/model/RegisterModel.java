package register.com.model;

import java.sql.Timestamp;
import java.util.Date;

import base.BaseEntity;


public class RegisterModel extends BaseEntity{
	int	id;
	String	username;
	String	mobile;
	String	email;
	String	password;
	int	usertype;
	Timestamp	regist_time;
	int	state;
	int	auth_sign;
	String	auth_code;
	Date	auth_sendtime;
	String	union_name;
	String	parter;
	String	pic_url;
	String	truename;
	Date	self_desc;
	String	personal_page;
	String	headline;
	String	interests;
	int	verify_status;
	String	user_address;
	String	origin;
	String	uuid;
	String	keyPromotion;
	String	sourcePromotion;
	String	mPromotion;
	String	sendEmailDate;
	String	sex;
	String	qq_num;
	String	sign;
	int	message_set;
	int	note_set;
	int	money;
	String	medal;
	int	continue_sign_day;
	String	phone_id_code;
	String	login_type;
	int	vip;
	String	pic_url_mid;
	String	pic_url_min;
	String	profession;
	String	token;
	String	birthday;
	String	tiku_app_bg;
	int	agreement_type;
	int	register_channel;
	int	mobile_confirm;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUsertype() {
		return usertype;
	}
	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}

	public Timestamp getRegist_time() {
		return regist_time;
	}
	public void setRegist_time(Timestamp regist_time) {
		this.regist_time = regist_time;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getAuth_sign() {
		return auth_sign;
	}
	public void setAuth_sign(int auth_sign) {
		this.auth_sign = auth_sign;
	}
	public String getAuth_code() {
		return auth_code;
	}
	public void setAuth_code(String auth_code) {
		this.auth_code = auth_code;
	}
	public Date getAuth_sendtime() {
		return auth_sendtime;
	}
	public void setAuth_sendtime(Date auth_sendtime) {
		this.auth_sendtime = auth_sendtime;
	}
	public String getUnion_name() {
		return union_name;
	}
	public void setUnion_name(String union_name) {
		this.union_name = union_name;
	}
	public String getParter() {
		return parter;
	}
	public void setParter(String parter) {
		this.parter = parter;
	}
	public String getPic_url() {
		return pic_url;
	}
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	public Date getSelf_desc() {
		return self_desc;
	}
	public void setSelf_desc(Date self_desc) {
		this.self_desc = self_desc;
	}
	public String getPersonal_page() {
		return personal_page;
	}
	public void setPersonal_page(String personal_page) {
		this.personal_page = personal_page;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public int getVerify_status() {
		return verify_status;
	}
	public void setVerify_status(int verify_status) {
		this.verify_status = verify_status;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getKeyPromotion() {
		return keyPromotion;
	}
	public void setKeyPromotion(String keyPromotion) {
		this.keyPromotion = keyPromotion;
	}
	public String getSourcePromotion() {
		return sourcePromotion;
	}
	public void setSourcePromotion(String sourcePromotion) {
		this.sourcePromotion = sourcePromotion;
	}
	public String getmPromotion() {
		return mPromotion;
	}
	public void setmPromotion(String mPromotion) {
		this.mPromotion = mPromotion;
	}
	public String getSendEmailDate() {
		return sendEmailDate;
	}
	public void setSendEmailDate(String sendEmailDate) {
		this.sendEmailDate = sendEmailDate;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getQq_num() {
		return qq_num;
	}
	public void setQq_num(String qq_num) {
		this.qq_num = qq_num;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public int getMessage_set() {
		return message_set;
	}
	public void setMessage_set(int message_set) {
		this.message_set = message_set;
	}
	public int getNote_set() {
		return note_set;
	}
	public void setNote_set(int note_set) {
		this.note_set = note_set;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getMedal() {
		return medal;
	}
	public void setMedal(String medal) {
		this.medal = medal;
	}
	public int getContinue_sign_day() {
		return continue_sign_day;
	}
	public void setContinue_sign_day(int continue_sign_day) {
		this.continue_sign_day = continue_sign_day;
	}
	public String getPhone_id_code() {
		return phone_id_code;
	}
	public void setPhone_id_code(String phone_id_code) {
		this.phone_id_code = phone_id_code;
	}
	public String getLogin_type() {
		return login_type;
	}
	public void setLogin_type(String login_type) {
		this.login_type = login_type;
	}
	public int getVip() {
		return vip;
	}
	public void setVip(int vip) {
		this.vip = vip;
	}
	public String getPic_url_mid() {
		return pic_url_mid;
	}
	public void setPic_url_mid(String pic_url_mid) {
		this.pic_url_mid = pic_url_mid;
	}
	public String getPic_url_min() {
		return pic_url_min;
	}
	public void setPic_url_min(String pic_url_min) {
		this.pic_url_min = pic_url_min;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTiku_app_bg() {
		return tiku_app_bg;
	}
	public void setTiku_app_bg(String tiku_app_bg) {
		this.tiku_app_bg = tiku_app_bg;
	}
	public int getAgreement_type() {
		return agreement_type;
	}
	public void setAgreement_type(int agreement_type) {
		this.agreement_type = agreement_type;
	}
	public int getRegister_channel() {
		return register_channel;
	}
	public void setRegister_channel(int register_channel) {
		this.register_channel = register_channel;
	}
	public int getMobile_confirm() {
		return mobile_confirm;
	}
	public void setMobile_confirm(int mobile_confirm) {
		this.mobile_confirm = mobile_confirm;
	}
}
