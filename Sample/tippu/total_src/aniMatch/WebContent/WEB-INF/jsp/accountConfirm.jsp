<!-- 登録確認画面を出力するビュー -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.AccountInfo" %>

<%
// セッションスコープからユーザー情報を取得
AccountInfo accountInfoOnSession = (AccountInfo) session.getAttribute("ACCOUNT_INFO");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>あにマッチ</title>
<link rel = "stylesheet" href = "css/style.css">

</head>
<body>
<h1>登録確認画面</h1>
	<p>名前：<%= accountInfoOnSession.getUserName() %><br>
		ユーザーID：<%= accountInfoOnSession.getUserId() %><br>
		パスワード：****<br></p>

<!-- 修正用のリンク -->
<a href="/aniMatch/AccountRegist"><button>修正</button></a><br><br>



<style>
section {
	overflow: scroll;
	margin: 50px AUTO 20px;
	padding: 30px;
	width: 500px;
	height: 200px;
	border: 2px solid #ccc;
}
h1 {
 	min-width: 400px;
}
p {
 	min-width: 400px;
}
figure {
 	width: 400px;
}
</style>

<section>
	<h1>譲渡契約書</h1>
	<p>

私、あにマッチ管理者（以下甲とする）は、本登録をもって新規登録者（以下乙とする）を里親として認め譲渡することに承諾しました。<br><br>

<p style="text-align: center">
  記
</p><br>


<b>１．	譲渡について</b><br>
甲は乙のもとでの飼育環境が譲渡予定動物に適しており、乙が新しい家族として充分信頼できる人物であると認めます。 <br><br>

<b>２．	所有権について</b><br>
譲渡動物の所有権は本正式譲渡契約をもって乙に移ります。<br>
ただし、本契約書記載内容に対しての 違反が認められた場合、ならびに動物を飼うのに不都合な事実の隠ぺい（経済面・健康面）、
または本契約書記載の住所、身分等に虚偽の内容があった場合、または住所変更に際し甲への住所変更通知を故意に怠った場合、
その時点で譲渡動物の所有権は甲に戻され譲渡動物は甲に返還することとします。 <br><br>

<b>３．	譲渡動物の返還について </b><br>
正式譲渡後であっても乙において譲渡に際しての約束が守られていない（本契約書への違反）と甲が判断した場合は、
契約不履行として甲は譲渡動物の返還請求をすることができ、乙はそれに応じなくてはなりません。<br>
また乙が譲渡動物の飼育者として不適格であると甲が感じた場合、甲と乙の信頼関係が損なわれた場合にも、
甲からの譲渡動物返還請求に応じなくてはなりません。
その場合譲渡動物の返還にかかるすべての費用は乙負担とします。 <br><br>

<b>４．	飼養放棄（飼えなくなること）について</b><br>
乙は、正式譲渡後について、いかなる理由（結婚、離婚、リストラ、倒産、海外赴任、火事、病気、アレルギー、出産 、一家離散、
家族死亡、本人死亡、自然災害、譲渡動物の問題行動や疾患など）をもっても譲渡動物の飼養放棄はできません。<br>
万一、譲渡動物を飼育できないと感じる事態が起こった場合は、必ず甲に報告する義務を負います。<br>
やむなき事情で飼育が困難と感じた場合、甲の指導のもとに環境改善の努力をします。
飼育が困難となっても譲渡動物を捨てたり行政処分に持ち込むことなく、速やかに甲へ飼養放棄の通達をし、
その所有権は甲へ戻し次の乙への譲渡成立までにかかる費用を全て負担しなくてはなりません。<br><br>

<b>５．	面会について</b><br>
乙は正式譲渡契約後も、甲からの譲渡動物の写真請求や面会請求に応じなくてはなりません。<br>
それにより飼育状況につき改善要求が出された場合には誠意を持って対応し、譲渡動物の飼育にふさわしい環境を整える義務を負います。
甲はそのための相談に応じ、指導する義務があります。 <br><br>

<b>６．事故等について</b><br>
 ａ．過失により譲渡予定動物を逃がしてしまった場合は速やかに甲に連絡を取り、対策を講じなくてはなりません。
 場合によってはその責任を問われることがあります。 <br>
ｂ．譲渡動物を死亡させてしまった場合、正式譲渡契約後でも死亡に不審な点が見受けられる場合は、甲は乙に対し獣医による死亡診断書の提出を求めることができます。<br>
正式譲渡契約後の譲渡動物の死亡について不審な点がある場合は、乙は法的にその責任を問われることがあります。 <br>
ｃ．正式譲渡後の譲渡動物による咬傷事故等、またそれに関わる損害賠償請求が発生した場合については、甲はその責任を問われないものとし、
乙が一切の責任を負い、誠意を持って対応するものとします。 <br><br>

<b>７．正式譲渡契約後の健康管理について</b><br>
    下記の項目について責任をもって対処します。 <br>
ａ．乙は甲から請求された場合、狂犬病予防ワクチン接種、各種伝染病予防ワクチン接種、不妊去勢手術、フィラリア予防薬投薬記録、
その他健康に関する事柄について証明書や診断書を提出しなければなりません。 <br>
ｂ．乙は譲渡動物に対して、雄は去勢手術、雌は不妊手術を受けさせなくてはなりません。
乙が動物の飼育初心者いかんに関わらず甲は各手術完了まで相談および指導を行う義務を負います。<br>
ｃ．乙は譲渡動物に対し、各種伝染病予防のため、適切な時期にワクチンを接種させなくてはいけません。<br>
ｄ．乙は譲渡動物に対し、病気予防にこころがけ、万一罹患した場合には速やかに獣医師の診断を受け、適切な治療を受けさせなくてはなりません。 <br><br>

<b>８．費用について</b><br>
    正式譲渡後の譲渡動物にかかる食費、治療費などを含む全ての費用は乙負担とします。<br><br>

 <b>９．所有者がわかる措置について</b><br>
乙は譲渡動物が迷子にならないよう首輪に迷子札を取り付けなくてはなりません。
また譲渡動物は決して放し飼いせず、猫に限っては必ず室内飼育をしなくてはなりません。<br><br>

<b>10．正式譲渡契約後の飼育に関しての衛生基準</b><br>
ａ．乙は、譲渡動物の飲み水は毎日取り替え、食器は使用の度に洗わなくてはなりません。<br>
ｂ．乙は、猫については猫用トイレ砂を用意し、毎日排泄物を掃除しなくてはなりません。<br>
また、犬については排泄物を毎日きれいに掃除し、また散歩で排泄した場合は持ち帰り処分しなくてはなりません。<br>
ｃ．乙は、譲渡動物が誤って異物を食べてしまわないように、飼育環境は常に清潔に保ち、衛生状態に気を配らなくてはなりません。 <br><br>

<b>11.本誓約書について</b> <br>
本譲渡契約書の内容に 違反する行為が認められた場合には、譲渡動物の返還を求められる、または飼育環境や飼育態度の改善を求められます。
これは乙が譲渡動物を家族として迎えるための譲渡です。<br>
譲渡動物の業者への転売（乙詐欺）、動物虐待目的、繁殖目的など本譲渡契約書の主旨に反する行為が若干でも認められた場合、
または甲にその疑いを抱かせるような行為や態度が認められた場合は、乙は甲の請求に従い直ちに譲渡動物を返 還しなくてはなりません。
また、責任を問われ法的措置を取られても異存はありません。<br><br>

以上、上記について乙はこれを遵守し、譲渡動物を家族の一員として習性を理解するよう努め、最期まで責任を持ち飼育する事を誓約いたします。
乙およびその家族全員並びに甲は上記についてすべて承諾し、両者合意のもと、譲渡の契約を結ぶことといたします。<br><br>


<p style="text-align: right">
  以上
</p>
<br>

<p style="text-align: right">
  <b>2021年11月</b><br>
<b>あにマッチ管理者</b></p>
<br><br>



<i>※個人情報取り扱いについて 犯罪防止活動のために、関係諸機関及び警察に情報を開示する場合がございます。</i>

</section>

<br>



<form action="/aniMatch/AccountRegist" method="post">
<input type="submit" name="regist" value="同意して登録する" >
</form>

</body>
</html>
