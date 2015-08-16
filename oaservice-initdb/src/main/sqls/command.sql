--CSVファイル出力
--単純なCOPYコマンド構文
COPY tablename TO '/tmp/output.csv' DELIMITER ','

--列指定のCOPYコマンド構文
COPY tablename(col1, col2, col3) TO '/tmp/output.csv' DELIMITER ','

--SELECT結果のCOPYコマンド構文
COPY (SELECT * FROM tablename) TO '/tmp/output.csv' DELIMITER ','

--CSVファイル復元
--出力結果を復元するにはCOPY…FROM
COPY tablename FROM '/tmp/output.csv'