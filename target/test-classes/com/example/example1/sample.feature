@Practice
Feature: Yahooのテスト
  # 検索処理
  Scenario: 検索処理
    Given Chromeを起動
    Then Yahooのページを開く
    Then Yahooのページが表示される
    When 検索に"ベリサーブ"を入力する
    And 検索ボタンをクリックする
    Then Chromeを閉じる